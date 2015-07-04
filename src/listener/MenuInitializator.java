package listener;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;
import org.sword.lang.HttpUtils;
import org.sword.wechat4j.token.Token;
import org.sword.wechat4j.token.TokenProxy;

public class MenuInitializator implements ServletContextListener {

	private static Logger logger = Logger.getLogger(MenuInitializator.class);
	private String URL_CREATE_REQUEST = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=";

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {

	}

	/**
	 * when servlet context is created, initialize the menu
	 */
	@Override
	public void contextInitialized(ServletContextEvent event) {
		try {
		logger.info("initialize the menu...");
		String access_token = TokenProxy.accessToken();
		String url = URL_CREATE_REQUEST + access_token;
		// File menu = new File();
		String data = "";
		String tmp = "";
		try (InputStreamReader reader = new InputStreamReader(ClassLoader
				.getSystemClassLoader().getResourceAsStream("menu.json"))) {
			BufferedReader br = new BufferedReader(reader);
			while (true) {
				tmp = br.readLine();
				if (tmp != null) {
					data += tmp;
				} else {
					break;
				}
			}

			br.close();
		} catch (IOException e) {
			logger.info("file: menu.json not found in JCP");
			e.printStackTrace();
		}

		// send the request
		logger.info("send the request to " + url + ". and the data is: " + data);
		try {
			HttpClient httpclient = new DefaultHttpClient();
			SSLContext ctx = SSLContext.getInstance("SSL");
			X509TrustManager tm = new X509TrustManager() {  
				  
                public void checkClientTrusted(X509Certificate[] xcs,  
                        String string) throws CertificateException {  
  
                }  
  
                public void checkServerTrusted(X509Certificate[] xcs,  
                        String string) throws CertificateException {  
                }  
  
                public X509Certificate[] getAcceptedIssuers() {  
                    return null;  
                }  
            };  
            ctx.init(null, new TrustManager[] { tm }, null);  
            SSLSocketFactory ssf = new SSLSocketFactory(ctx);  
  
            ClientConnectionManager ccm = httpclient.getConnectionManager();  
                        //register https protocol in httpclient's scheme registry  
            SchemeRegistry sr = ccm.getSchemeRegistry();  
            sr.register(new Scheme("https", 443, ssf)); 
            
			HttpPost httpPost = new HttpPost(url);
			List<NameValuePair> formParams = new ArrayList<NameValuePair>(); //构建POST请求的表单参数 

            formParams.add(new BasicNameValuePair("body", data)); 

            httpPost.setEntity(new UrlEncodedFormEntity(formParams, "UTF-8")); 
             
            HttpResponse response = httpclient.execute(httpPost); //执行POST请求 
            HttpEntity resEntity = response.getEntity();  
            System.out.println(EntityUtils.toString(resEntity,"UTF-8"));
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (KeyManagementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} catch(Exception ex){
			
			System.out.println(ex.toString());
			
		}

	}

	public static void main(String[] args) {
		MenuInitializator m = new MenuInitializator();
		m.contextInitialized(null);
	}

}

package ch07;
 
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
 
public class GetImage {
 
    public static void main(String[] args){
 
        GetImage getImage = new GetImage();
 
        String strUrl = "https://s3.ap-northeast-2.amazonaws.com/grepp-cloudfront/programmers_imgs/learn/thumb-course-java-basic.jpg"
        		+ ""; //�ҷ��� URL
 
        try {
 
            getImage.saveImage(strUrl);
 
        } catch (IOException e) {
 
            e.printStackTrace();
 
        }
 
    }
 
    private void saveImage(String strUrl) throws IOException {
 
        URL url = null;
        InputStream in = null;
        OutputStream out = null;
 
        try {
 
            url = new URL(strUrl);
 
            in = url.openStream();
 
            out = new FileOutputStream("C:/dev/test.jpg"); //������
 
            while(true){
                //�̹����� �о�´�.
                int data = in.read();
                if(data == -1){
                    break;
                }
                //�̹����� ����.
                out.write(data);
 
            }
 
            in.close();
            out.close();
 
        } catch (Exception e) {
 
            e.printStackTrace();
 
        }finally{
 
            if(in != null){in.close();}
            if(out != null){out.close();}
 
        }
    }
}
package chap_13;

import java.io.*;

public class _06_ReadWriteFile {
    public static void main(String[] args) {
        // BufferedReader
        // BufferedWriter

        // 파일 쓰기
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("goodjob.txt",true))){
            bw.write("이제 끝이 보인다");
            bw.newLine();
            bw.write("수고했어");
            bw.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 파일 읽기
        try (BufferedReader br = new BufferedReader(new FileReader("goodjob.txt"))){
            String line;
            while((line = br.readLine())!= null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

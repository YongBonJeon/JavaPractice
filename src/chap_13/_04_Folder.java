package chap_13;

import java.io.File;

public class _04_Folder {
    public static void main(String[] args) {
        String folderName = "A";
        File folder = new File(folderName);
        folder.mkdir();
        if(folder.exists()){
            System.out.println("폴더 존재 " + folder.getAbsolutePath());
        }

        folderName = "A/B/C";
        folder = new File(folderName);
        folder.mkdirs();
        if(folder.exists()){
            System.out.println("폴더 존재 " + folder.getAbsolutePath());
        }else{
            System.out.println("폴더 생성 실패");
        }
    }
}

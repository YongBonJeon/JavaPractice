package chap_13;

import java.io.File;

public class _07_DeleteFile {
    public static void main(String[] args) {
        File file = new File("test.txt");
        if(file.delete()){
            System.out.println("파일 삭제 성공 : " + file.getName());
        }else{
            System.out.println("파일 삭제 실패 : " + file.getName());
        }

        File folder = new File("A");
        if(folder.exists()){
            if(folder.delete()){
                System.out.println("폴더 삭제 성공 : " + folder.getName());
            }else{
                System.out.println("폴더 삭제 실패 : " + folder.getName());
            }
        }

        deleteFolder(folder);


    }
    public static boolean deleteFolder(File folder){
        if(folder.isDirectory()){
            for(File f : folder.listFiles()){
                deleteFolder(f);
            }
        }
        System.out.println("삭제 대상 : " + folder.getAbsolutePath());
        return folder.delete();
    }
}

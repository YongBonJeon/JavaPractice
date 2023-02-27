package chap_07;

public class _18_Enum {
    public static void main(String[] args) {
        Resolution resolution = Resolution.HD;
        System.out.println(resolution);

        switch (resolution){
            case HD:
                System.out.println("일반화질");
                break;
            case FHD :
                System.out.println("고화질");
                break;
            case UHD:
                System.out.println("초고화질");
                break;
        }

        resolution = Resolution.valueOf("UHD");
        System.out.println(resolution);

        for(Resolution myRes : Resolution.values()){
            System.out.println(myRes + " " + myRes.ordinal());
        }
        System.out.println();
        for(Resolution myRes : Resolution.values()){
            System.out.println(myRes.name()+ " : " + myRes.ordinal() + " : "  + myRes.getWidth());
        }
    }
}

enum Resolution{
    HD(1200),FHD(1920),UHD(3040);

    private final int width;

    Resolution(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}

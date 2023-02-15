public class Main {

    //    Main Class をスタートするクラス
    public static void main(String[] args) {
        byte myByte = 12; // 1 byte
        short myShort = 13; // 2 bytes
        int myInt = 14; // 4 bytes
        long myLong = 15L; // 8 bytes

        float myFloat = 12.43F; // 4 bytes
        double myDouble = 124.33D; // 8 bytes

//        Data Update
        myByte = 127;
//        myByte = myShort;
//        myByte = myInt;
//        myByte = myLong;
//        myByte = myFloat;
//        myByte = myDouble;

        myShort = myByte;
//        myShort = myInt;
//        myShort = myLong;
//        myShort = myFloat;
//        myShort = myDouble

        myInt = myByte;
        myInt = myShort;
//        myInt = myLong;
//        myInt = myFloat;
//        myInt = myDouble;

        myLong = myByte;
        myLong = myShort;
        myLong = myInt;
//        myLong = myFloat;
//        myLong = myDouble;


        myFloat = myByte;
        myFloat = myShort;
        myFloat = myInt;
        myFloat = myLong;
//        myFloat = myDouble;

        myDouble = myByte;
        myDouble = myShort;
        myDouble = myInt;
        myDouble = myLong;
        myDouble = myFloat;
    }
}
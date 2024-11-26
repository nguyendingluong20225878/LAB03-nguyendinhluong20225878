public class TestPassingParameter {

    public static void main(String[] args) {

        // Tạo các đối tượng DigitalVideoDisc
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        // In tiêu đề của các DVD trước khi hoán đổi
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

        // Hoán đổi các DVD
        swap(jungleDVD, cinderellaDVD);

        // In tiêu đề của các DVD sau khi hoán đổi
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

        // Đổi tiêu đề của DVD jungle
        changeTitle(jungleDVD, cinderellaDVD.getTitle());

        // In tiêu đề của DVD jungle sau khi đổi tên
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }

    // Hoán đổi giá trị của hai đối tượng DigitalVideoDisc
    public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        DigitalVideoDisc temp = dvd1;
        dvd1 = dvd2;
        dvd2 = temp;
    }

    // Thay đổi tiêu đề của DigitalVideoDisc
    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        dvd.setTitle(title);
    }
}

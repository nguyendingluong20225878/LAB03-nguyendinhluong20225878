package hust.soict.dsai.aims.disc;
public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private static int nbDigitalVideoDiscs = 0; // Biến đếm số DVD được tạo ra

    private int id;

    // Constructor chỉ có tiêu đề
    public DigitalVideoDisc(String title) {
        this.title = title;
        nbDigitalVideoDiscs++; 
        this.id = nbDigitalVideoDiscs; 
    }

    // Constructor với tiêu đề, thể loại và chi phí
    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // Constructor với tiêu đề, thể loại, đạo diễn và chi phí
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // Constructor đầy đủ với tất cả các thông tin
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // Phương thức trả về thông tin DVD dưới dạng chuỗi
    public String toString() {
        String dvdInfo = "Title: " + title + ", Category: " + category;
        
        // Nếu có đạo diễn, thêm thông tin đạo diễn vào
        if (director != null && !director.isEmpty()) {
            dvdInfo += ", Director: " + director;
        }

        // Nếu có độ dài, thêm thông tin độ dài vào
        if (length > 0) {
            dvdInfo += ", Length: " + length;
        }

        dvdInfo += ", Cost: $" + cost;
        
        return dvdInfo;
    }

    // Các getter và setter
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    // Phương thức tĩnh trả về số lượng DVD đã tạo
    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

    // Phương thức kiểm tra xem tiêu đề có trùng khớp không
    public boolean isMatch(String title) {
        return this.title.equalsIgnoreCase(title);
    }
}
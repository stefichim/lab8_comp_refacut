package lab8Compulsory_refacut;

public class Main {
	public static void main(String[] args) {

        Database db = Database.getInstance();
        ArtistController artistController = new ArtistController(db);
        AlbumController albumController = new AlbumController(db);

         artistController.create("Trupa1","Romania");
        artistController.create("Trupa2","UK");
     
        artistController.findByName("Trupa1");
        artistController.findByName("Stefan");
   //     albumController.findByArtist(1);
     //   albumController.findByArtist(2);
    }
}

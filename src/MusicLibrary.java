public class MusicLibrary {
    private Album[] library;

    public MusicLibrary(){
        library = new Album[10];
    }

    public boolean add(Album album){
        for(Album i : library){
            if(i == null){
                i = album;
                return true;
            }
        }
        return false;
    }

    public boolean remove(int index){
        if((index >= 0 && index < library.length) && library[index] == null){
            library[index] = null;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String libraryPrint = "";
        for(Album a : library){
            if(a != null)
                libraryPrint += a.toString() + "\n";
        }
        return libraryPrint;
    }

    public int searchTitle(String title){
        for(int i = 0; i < library.length; i++){
            if(library[i] != null && library[i].getTitle() == title)
                return i;
        }
        return -1;
    }

    public int searchArtist(String artist){
        for(int i = 0; i < library.length; i++){
            if(library[i] != null && library[i].getArtist() == artist)
                return i;
        }
        return -1;
    }

    public Album getAlbum(int index){
        if(index >= 0 && index < library.length)
            return library[index];
        else{
            System.out.println("Search index out of range");
            return null;
        }
    }
}

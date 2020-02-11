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

    public void sortByTitle(){
        Album temp;
        int min;
        for (int i = 0; i < library.length - 1; i++) {
            min = i;
            for(int scan = i + 1; scan < library.length; scan++) {
                if (library[scan] != null && library[i] != null) {
                    if (library[scan].getTitle().compareTo(library[i].getTitle()) < 0) {
                        min = scan;
                    }
                }
            }

            temp = library[min];
            library[min] = library[i];
            library[i] = temp;
        }
    }

    public void sortByArtist(){
        for (int i = 0; i < library.length; i++){
            Album key = library[i];
            int pos = i;

            while(pos > 0 && library[pos-1].getArtist().compareTo(key.getArtist()) > 0){
                library[pos] = library[pos-1];
                pos--;
            }
            library[pos] = key;
        }
    }
}

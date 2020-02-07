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
            return false;
        }
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

    }
}

public class LocationRepository implements IteratorContainer{
    
    public String location[] = {"France", "USA", "Russia"};

    public Iterator getIterator(){
        return new LocationIterator();
    }

    private class LocationIterator implements Iterator{

        int index;

        public boolean hasNext(){

            if(index < location.length){
                return true;
            }
            return false;

        }

        public Object next(){
            if(this.hasNext()){
                return location[index++];
            }
            return null;
        }
    }
}

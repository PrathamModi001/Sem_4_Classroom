
public class NameRepository implements IteratorContainer{
    
    public String names[] = {"A380", "B747", "An225"};
    

    public Iterator getIterator(){
        return new NameIterator();
    }

    private class NameIterator implements Iterator{

        int index;

        public boolean hasNext(){

            if(index < names.length){
                return true;
            }
            return false;
        }

        public Object next(){

            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }

}

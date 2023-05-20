public class NumberRepository implements IteratorContainer{
    
    public String numbers[] = {"P1", "P2", "P3"};
    

    public Iterator getIterator(){
        return new NumberIterator();
    }

    private class NumberIterator implements Iterator{

        int index;

        public boolean hasNext(){

            if(index < numbers.length){
                return true;
            }
            return false;
        }

        public Object next(){

            if(this.hasNext()){
                return numbers[index++];
            }
            return null;
        }
    }

}


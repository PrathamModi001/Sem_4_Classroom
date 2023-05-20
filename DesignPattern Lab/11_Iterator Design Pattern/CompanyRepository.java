public class CompanyRepository implements IteratorContainer{
    
    public String companies[] = {"Airbus", "Boeing", "Antonov"};
    

    public Iterator getIterator(){
        return new CompanyIterator();
    }

    private class CompanyIterator implements Iterator{

        int index;

        public boolean hasNext(){

            if(index < companies.length){
                return true;
            }
            return false;
        }

        public Object next(){

            if(this.hasNext()){
                return companies[index++];
            }
            return null;
        }
    }

}

public class IteratorFinal {
    
    public static void main(String[] args) {
        
        System.out.println("-----");
        
        NumberRepository numberRepository = new NumberRepository();
        NameRepository namesRepository = new NameRepository();
        CompanyRepository companyRepository = new CompanyRepository();
        LocationRepository locationRepository = new LocationRepository();

        for(Iterator iter1 = numberRepository.getIterator(); iter1.hasNext();){
            for(Iterator iter2 = namesRepository.getIterator(); iter2.hasNext();){
                for(Iterator iter3 = companyRepository.getIterator(); iter3.hasNext();){
                    for(Iterator iter4 = locationRepository.getIterator(); iter4.hasNext();){

                        String number = (String)iter1.next();
                        System.out.println("Information about aircraft: " +number);

                        String name = (String)iter2.next();
                        System.out.println("Name of the aircraft: " +name);
                        
                        String company = (String)iter3.next();
                        System.out.println("Manufacturing Company: " +company);

                        String location = (String)iter4.next();
                        System.out.println("Country of origin: " +location);

                        System.out.println("-----");

                    }
                }
            }
        }

    }
}


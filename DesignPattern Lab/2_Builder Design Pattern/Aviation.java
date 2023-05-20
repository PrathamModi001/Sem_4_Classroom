interface AirPlan
{
	public void setName(String name);

	public void setCompany(String company);

	public void setPrice(int price);

	public void setDate(int date);
}

class Plane implements AirPlan
{

	private String name;
	private String company;
	private int price;
	private int date;

	public void setName(String name)
	{
		this.name = name;
	}

	public void setCompany(String company)
	{
		this.company = company;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}

	public void setDate(int date)
	{
		this.date = date;
	}

}


interface PlaneBuilder
{

	public void buildName();

	public void buildCompany();

	public void buildPrice();

	public void buildDate();

	public Plane getPlane();
}

class BoeingBuilder implements PlaneBuilder
{
	private Plane plane;

	public BoeingBuilder()
	{
		this.plane = new Plane();
	}

	public void buildName()
	{
		plane.setName("B747");
	}

	public void buildCompany()
	{
		plane.setCompany("Boeing");
	}

	public void buildDate()
	{
		plane.setPrice(30000);
	}

	public void buildPrice()
	{
	    plane.setDate(24);
	}

	public Plane getPlane()
	{
		return this.plane;
	}
}

class AirbusBuilder implements PlaneBuilder
{
	private Plane plane;

	public AirbusBuilder()
	{
		this.plane = new Plane();
	}

	public void buildName()
	{
	    plane.setName("A380");
	}

	public void buildCompany()
	{
	    plane.setCompany("Airbus");
	}

	public void buildPrice()
	{
		plane.setPrice(40000);
    }

	public void buildDate()
	{
		plane.setDate(31);
	}

	public Plane getPlane()
	{
		return this.plane;
	}

}

class PlaneEngineer
{

	private PlaneBuilder planeBuilder;

	public PlaneEngineer(PlaneBuilder planeBuilder)
	{
		this.planeBuilder = planeBuilder;
	}

	public Plane getPlane()
	{
		return this.planeBuilder.getPlane();
	}

	public void constructPlane()
	{
		this.planeBuilder.buildName();
		this.planeBuilder.buildCompany();
		this.planeBuilder.buildPrice();
		this.planeBuilder.buildDate();
	}
}

class Builder
{
	public static void main(String[] args)
	{
		PlaneBuilder boeingBuilder = new BoeingBuilder();
		PlaneEngineer engineer = new PlaneEngineer(boeingBuilder);

		engineer.constructPlane();

		Plane plane = engineer.getPlane();

		System.out.println("Builder constructed: "+ plane);
	}
}

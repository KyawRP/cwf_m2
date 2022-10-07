package cwf.m2;

import java.util.Comparator;
import java.util.Objects;

public class Product {
	private String id;
	private String name;
	private String location;
	private double price;

	/**
	 * @param id
	 * @param name
	 * @param location
	 * @param price
	 */
	public Product(String id, String name, String location, double price) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.price = price;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param artiste the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param songLength the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(location, id, price, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Product))
			return false;
		Product other = (Product) obj;
		return Objects.equals(location, other.location) && Objects.equals(id, other.id)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(name, other.name);
	}

	public static final Comparator<Product> nameComparator = (p1, p2) -> {
        if (p2.getName().equals(p1.getName())) {
          return 1;
        }
        return p2.getName().equals(p1.getName()) ? 0 : 1;
      };

	public static final Comparator<Product> priceComparator = (p1, p2) -> {
        if (p2.getPrice() < p1.getPrice()) {
          return 1;
        }
        return p2.getPrice() == p1.getPrice() ? 0 : 1;
      };
}

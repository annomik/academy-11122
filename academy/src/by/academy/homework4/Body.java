package by.academy.homework4;

import java.util.Objects;

public class Body {

	public Heart heart;
	public Lungs lungs;

	public class Heart {

		public void live() {
			for (int i = 0; i < Integer.MAX_VALUE; i++) {
				if ((i + 1) % 100 == 0) {
					System.out.println("Knock-knock-knockin' on heaven's door");
				}
			}
		}

	}

	public class Lungs {

		public void live() {
			for (int i = 0; i < Integer.MAX_VALUE; i++) {
				if ((i+1) % 50 == 0) {
					System.out.println("breathe in");
				}
				if ((i+1) % 100 == 0) {
					System.out.println("breathe out");
				}
			}
		}

	}

	public void live() {
		heart.live();
		lungs.live();
	}

	public Body() {
		super();

		Heart heart = new Heart();
		this.heart = heart;
		
		Lungs lungs = new Lungs();
		this.lungs = lungs;
	}

	@Override
	public String toString() {
		return "Body [heart=" + heart + ", lungs=" + lungs + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(heart, lungs);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Body other = (Body) obj;
		return Objects.equals(heart, other.heart) && Objects.equals(lungs, other.lungs);
	}

	
}

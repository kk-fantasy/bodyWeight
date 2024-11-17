package bodyWeight;

public class Calculation {
	private double height;
	private double bodyweight;
	
	public double getHeight() {
		return this.height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getBodyweight() {
		return this.bodyweight;
	}
	public void setBodyweight(double bodyweight) {
		this.bodyweight = bodyweight;
	}
	
	public void weightcalculation() {
		double total = getBodyweight() / (getHeight() * getHeight());
		
		if(total < 18.5) {
			System.out.println("低体重です。");
		}else if(total >= 18.5 && total <= 24.9) {
			System.out.println("普通体重です。");
		}else if(total >= 25 && total <= 29.9) {
			System.out.println("肥満1です。");
		}else {
			System.out.println("肥満2です。");
		}
	}

}

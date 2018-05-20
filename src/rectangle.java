public class Rectangle {
	public int length;
	public int width;

	public Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}
	public int getArea(){
		return this.length * this.width;
	}
	public int getPerimiter(){
		return 2 * (this.length + this.width);
	}
}
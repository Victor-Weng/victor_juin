
 
import javafx.beans.property.*;

public class Nombre1
	{
		private DoubleProperty num1;
		
		public final double getNombre1()
		{
				if(num1 !=null)
					return num1.get();
				return 0;
		}
		
		public final void setNombre1(double number)
		{
				this.nombreProperty1().set(number);
		}
		
		public final DoubleProperty nombreProperty1()
		{
				if(num1==null)
					num1=new SimpleDoubleProperty(0);
				return num1;
		}
		
		
		
		

	}

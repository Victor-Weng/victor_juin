
 
import javafx.beans.property.*;

public class Nombre
	{
		private DoubleProperty num;
		
		public final double getNombre()
		{
				if(num !=null)
					return num.get();
				return 0;
		}
		
		public final void setNombre(double number)
		{
				this.nombreProperty().set(number);
		}
		
		public final DoubleProperty nombreProperty()
		{
				if(num==null)
					num=new SimpleDoubleProperty(0);
				return num;
		}
		
		
		
		

	}

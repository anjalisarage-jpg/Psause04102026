package GenUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Javauti {

	public void togetfuturedate()
	{
		Date d= new Date();
		SimpleDateFormat sim= new SimpleDateFormat("dd-MM-yyy");
		sim.format(d);
		
		Calendar c = sim.getCalendar();
		c.add(Calendar.DAY_OF_MONTH, 30);
		sim.format(c.getTime());
	}
}

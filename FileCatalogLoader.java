import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;
import java.io.*;
import java.math.*;

/**
 * 
 * 该类实现对四个产品的读入方法，并且实现了对产品目录的加载方法返回一个产品目录 参数列表： line：包含产品信息的字符串
 * filename：包含产品信息的文件名称 catalog：返回的产品列表
 * 
 * @author Admin
 *
 */
public class FileCatalogLoader implements CatalogLoader {
	/**
	 * 该方法完成了对line的读入并创建返回一个PureMilk对象
	 * 
	 * @param line
	 * @return PureMilk对象
	 * @throws ParseException
	 * @throws DataFormatException
	 */
	private PureMilk readPureMilk(String line) throws ParseException, DataFormatException {
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
		StringTokenizer strToken = new StringTokenizer(line);
		strToken.nextToken("_");
		if (strToken.countTokens() != 8) {
			throw new DataFormatException("数据格式错误");
		} else
			try {
				PureMilk pureMilk = new PureMilk(strToken.nextToken("_"), strToken.nextToken("_"),
						new BigDecimal(strToken.nextToken("_")), sdf.parse(strToken.nextToken("_")),
						strToken.nextToken("_"), strToken.nextToken("_"), strToken.nextToken("_"),
						strToken.nextToken("_"));
				return pureMilk;
			} catch (NumberFormatException e) {
				throw new DataFormatException("价格数据格式错误");
			}
	}

	/**
	 * 该方法完成了对line的读入并创建返回一个Jelly对象
	 * @param line
	 * @return Jelly
	 * @throws DataFormatException
	 * @throws ParseException
	 */
	private Jelly readJelly(String line) throws DataFormatException, ParseException {
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
		StringTokenizer strToken = new StringTokenizer(line);
		strToken.nextToken("_");
		if (strToken.countTokens() != 7) {
			throw new DataFormatException("数据格式错误");
		} else
			try {
				String code = strToken.nextToken("_");
				String description = strToken.nextToken("_");
				BigDecimal price = new BigDecimal(strToken.nextToken("_"));
				String temp = strToken.nextToken("_");
				Date productionDate = sdf.parse(temp);
				String shelfLife = strToken.nextToken("_");
				String type = strToken.nextToken("_");
				String diluteConcentration = strToken.nextToken("_");
				Jelly jelly = new Jelly(code, description, price, productionDate, shelfLife, type, diluteConcentration);
				return jelly;
			} catch (NumberFormatException e) {
				throw new DataFormatException("价格数据格式错误");
			}

	}

	/**
	 * 该方法完成了对line的读入并创建返回一个Yogurt对象
	 * 
	 * @param line
	 * @return Yogurt
	 * @throws DataFormatException
	 * @throws ParseException
	 */
	private Yogurt readYogurt(String line) throws DataFormatException, ParseException {
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
		StringTokenizer strToken = new StringTokenizer(line);
		strToken.nextToken("_");
		if (strToken.countTokens() != 6) {
			throw new DataFormatException("数据格式错误");
		} else
			try {
				String code = strToken.nextToken("_");
				String description = strToken.nextToken("_");
				BigDecimal price = new BigDecimal(strToken.nextToken("_"));
				String temp = strToken.nextToken("_");
				Date productionDate = sdf.parse(temp);
				String shelfLife = strToken.nextToken("_");
				String flavor = strToken.nextToken("_");
				Yogurt yogurt = new Yogurt(code, description, price, productionDate, shelfLife, flavor);
				return yogurt;
			} catch (NumberFormatException e) {
				throw new DataFormatException("价格数据格式错误");
			}

	}

	/**
	 * 该方法完成了对line的读入并创建返回一个MilkDrink对象
	 * 
	 * @param line
	 * @return MilkDrink
	 * @throws DataFormatException
	 * @throws ParseException
	 */
	private MilkDrink readMilkDrink(String line) throws DataFormatException, ParseException {
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
		StringTokenizer strToken = new StringTokenizer(line);
		strToken.nextToken("_");
		if (strToken.countTokens() != 7) {
			throw new DataFormatException("数据格式错误");
		} else
			try {
				String code = strToken.nextToken("_");
				String description = strToken.nextToken("_");
				BigDecimal price = new BigDecimal(strToken.nextToken("_"));
				String temp = strToken.nextToken("_");
				Date productionDate = sdf.parse(temp);
				String shelfLife = strToken.nextToken("_");
				String flavor = strToken.nextToken("_");
				String suger = strToken.nextToken("_");
				MilkDrink milkDrink = new MilkDrink(code, description, price, productionDate, shelfLife, flavor, suger);
				return milkDrink;
			} catch (NumberFormatException e) {
				throw new DataFormatException("价格数据格式错误");
			}

	}

	@Override
	/**
	 * 该方法实现了从文件加载目录并返回一个Catalog对象
	 * @param fileName
	 * @return catalog
	 */
	public Catalog loadCatalog(String fileName)
			throws FileNotFoundException, IOException, DataFormatException, ParseException {
		BufferedReader readFile = new BufferedReader(new FileReader(fileName));
		Catalog catalog = new Catalog();
		catalog.setProductList(new ArrayList<Product>());
		Product temp = null;
		String str = readFile.readLine();

		while (str != null) {
			if (str.startsWith("PureMilk")) {
				temp = readPureMilk(str);
			}
			if (str.startsWith("Jelly")) {
				temp = readJelly(str);
			}
			if (str.startsWith("Yogurt")) {
				temp = readYogurt(str);
			}
			if (str.startsWith("MilkDringk")) {
				temp = readMilkDrink(str);
			}
			str = readFile.readLine();
			catalog.getProductList().add(temp);
		}

		return catalog;
	}

}

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
 * ����ʵ�ֶ��ĸ���Ʒ�Ķ��뷽��������ʵ���˶Բ�ƷĿ¼�ļ��ط�������һ����ƷĿ¼ �����б� line��������Ʒ��Ϣ���ַ���
 * filename��������Ʒ��Ϣ���ļ����� catalog�����صĲ�Ʒ�б�
 * 
 * @author Admin
 *
 */
public class FileCatalogLoader implements CatalogLoader {
	/**
	 * �÷�������˶�line�Ķ��벢��������һ��PureMilk����
	 * 
	 * @param line
	 * @return PureMilk����
	 * @throws ParseException
	 * @throws DataFormatException
	 */
	private PureMilk readPureMilk(String line) throws ParseException, DataFormatException {
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
		StringTokenizer strToken = new StringTokenizer(line);
		strToken.nextToken("_");
		if (strToken.countTokens() != 8) {
			throw new DataFormatException("���ݸ�ʽ����");
		} else
			try {
				PureMilk pureMilk = new PureMilk(strToken.nextToken("_"), strToken.nextToken("_"),
						new BigDecimal(strToken.nextToken("_")), sdf.parse(strToken.nextToken("_")),
						strToken.nextToken("_"), strToken.nextToken("_"), strToken.nextToken("_"),
						strToken.nextToken("_"));
				return pureMilk;
			} catch (NumberFormatException e) {
				throw new DataFormatException("�۸����ݸ�ʽ����");
			}
	}

	/**
	 * �÷�������˶�line�Ķ��벢��������һ��Jelly����
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
			throw new DataFormatException("���ݸ�ʽ����");
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
				throw new DataFormatException("�۸����ݸ�ʽ����");
			}

	}

	/**
	 * �÷�������˶�line�Ķ��벢��������һ��Yogurt����
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
			throw new DataFormatException("���ݸ�ʽ����");
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
				throw new DataFormatException("�۸����ݸ�ʽ����");
			}

	}

	/**
	 * �÷�������˶�line�Ķ��벢��������һ��MilkDrink����
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
			throw new DataFormatException("���ݸ�ʽ����");
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
				throw new DataFormatException("�۸����ݸ�ʽ����");
			}

	}

	@Override
	/**
	 * �÷���ʵ���˴��ļ�����Ŀ¼������һ��Catalog����
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

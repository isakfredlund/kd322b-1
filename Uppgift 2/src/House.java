public class House{

private int year; //instansvariabel
private int size; //instansvariabel
private static int nbrOfHouses; //klassvariabler
public static final int MIN_SIZE=10; //klassvariabler
//final innebär att den variabeln inte kan tillägnas ett värde mer än en gång

public House(int _year,int _size){ //konstruktor
	year = _year;
	if (_size >= MIN_SIZE){
	size = _size;
	}else{
	size = MIN_SIZE;
	}
	nbrOfHouses++;
	}
//diverse kod
public static int getNbrHouses(){ //klassmetod
return nbrOfHouses;
}
public int getYear(){ //instansmetod
	return year;
//diverse kod
}
public int getSize(){ //instansmetod
	return size;
//diverse kod
}
}


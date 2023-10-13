package src;

import java.io.Serializable;
import java.util.Objects;

public class Ogrenci implements Serializable {
	private int id;
	private String ad;
	private int yas;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public Ogrenci() {
		super();
	}

	public Ogrenci(int id, String ad, int yas) {
		super();
		this.id = id;
		this.ad = ad;
		this.yas = yas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ad, id, yas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ogrenci other = (Ogrenci) obj;
		return Objects.equals(ad, other.ad) && id == other.id && yas == other.yas;
	}

	@Override
	public String toString() {
		return "Ogrenci [id=" + id + ", ad=" + ad + ", yas=" + yas + "]";
	}

}

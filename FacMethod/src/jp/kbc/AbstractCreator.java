package jp.kbc;

public abstract class AbstractCreator {
	private String name ;//ネーム

	private void mark(WindInstrumentProduct product){
		product.setPlate(name);
	}

	public void setName(String name){
		this.name = name;
	}

	//何かの管楽器を加工する→ネームプレートをつける→完成
	public WindInstrumentProduct create(){
		WindInstrumentProduct product = createInstrument();

		mark(product);
		return product;

	}

	public abstract WindInstrumentProduct createInstrument();
}

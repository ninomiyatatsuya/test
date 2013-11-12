package jp.kbc;

public class SaxophoneCreator extends AbstructCreator{
  @Override
  public WindInstrumentProduct createInstrument(){
    return new Saxophone();
  }
}

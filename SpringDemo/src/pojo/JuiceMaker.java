package pojo;

public class JuiceMaker {
    private Source source = null;

    public void setSource(Source source){
        this.source = source;
    }

    public Source getSource(){
        return this.source;
    }

    public String makeJuice(){
        String juice = "XXX客户点了一杯"+source.getFruit()+","+source.getSugar()+","+source.getSize();
        return juice;
    }
}

package pojo;

public class Source {
    private String fruit;//类型
    private String sugar;//糖分描述
    private String size;//大小杯

    public void setFruit(String fruit){
        this.fruit = fruit;
    }

    public void setSugar(String sugar){
        this.sugar = sugar;
    }

    public void setSize(String size){
        this.size = size;
    }

    public String getFruit(){
        return this.fruit;
    }

    public String getSugar(){
        return this.sugar;
    }

    public String getSize(){
        return this.size;
    }
}

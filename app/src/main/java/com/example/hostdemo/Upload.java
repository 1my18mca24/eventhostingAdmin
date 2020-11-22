package com.example.hostdemo;

public class Upload {

    private String eName;
    private String eResult;
    private String eLastUp;
    private String multiline;
    private String imageUrl;

    public Upload()
    {

    }

    public Upload(String eName,String eResult,String eLastUp,String multiline,String imageUrl)
    {
        if(eName.trim().equals("")){eName="No Event Name";}
        if(eResult.trim().equals("")){eResult="No Event Result Date";}
        if(eLastUp.trim().equals("")){eLastUp="No Event Last Date to Upload";}
        multiline.trim();
        this.eName=eName;
        this.eResult=eResult;
        this.eLastUp=eLastUp;
        this.multiline=multiline;
        this.imageUrl=imageUrl;
    }

    public String getName() {
        return eName;
    }
    public String geteResult() {
        return eResult;
    }
    public String geteLastUp() {
        return eLastUp;
    }
    public String getMultiline() {
        return multiline;
    }
    public void setName(String name,String result,String lastd,String mul) {
        eName = name;
        eResult=result;
        eLastUp=lastd;
        multiline=mul;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }



}

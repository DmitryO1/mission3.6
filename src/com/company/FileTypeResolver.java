package com.company;

import java.text.Normalizer;

import static com.company.FormatTxt.formatTxt;

/**
 * Created by Dmitry on 16.11.2016.
 */
public class FileTypeResolver {


    public Format resolver(String format) throws Exception {

        if(FormatTxt.formatTxt.equals(format)) {
            return new FormatTxt();

        }

        else if(FormatJson.json.equals(format)){
            return new FormatJson();
        }
        return null;
    }

}

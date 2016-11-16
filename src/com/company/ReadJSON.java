package com.company;

import java.io.FileReader;
import java.util.Iterator;
import java.util.Scanner;
import com.google.gson.Gson;
import java.util.Arrays;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by Dmitry on 15.11.2016.
 */
public class ReadJSON {


    public int[] toArray (String json, Gson parser) {

        return parser.fromJson(json, int[].class);
    }



}

/**
 * Copyright (C) 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package controllers;



//package model;

import com.google.inject.Singleton;


import model.Card;
import model.Deck;
import ninja.Context;
import ninja.Result;
import ninja.Results;

import com.google.inject.Singleton;
import ninja.params.Param;
import ninja.params.PathParam;

import java.util.ArrayList;


@Singleton
public class ApplicationController {

    public Result index() {
        return Results.html();
    }

    public Result acesUp() {
     //  model.Card =  model.Deck.drawFromDeck();
        return Results.html().template("views/AcesUp/AcesUp.flt.html");
    }
    public Result userInput(@PathParam("button") Integer button ){
        Result result = Results.html().template("views/AcesUp/AcesUp.flt.html");

        Deck deck = new Deck();

        if(button == 0){
            Card card1 = deck.drawFromDeck();
            Card card2 = deck.drawFromDeck();
            Card card3 = deck.drawFromDeck();
            Card card4 = deck.drawFromDeck();
            result.render("card1", card1);
            result.render("card2", card2);
            result.render("card3", card3);
            result.render("card4", card4);
        }else if(button == 1){

        }else if(button == 2){

        }else if(button == 3){

        }else if(button == 4){

        }else if(button == 5){

        }else if(button == 6){

        }else if(button == 7){

        }else if(button == 8){

        }

            return result;
     //   return Results.html().template("views/testview/testview.ftl.html");
    }





}

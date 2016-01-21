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
        Result result = Results.html().template("views/AcesUp/AcesUpStart.flt.html");

        Deck deck = new Deck();

        ArrayList<Card> col1;
        col1 = new ArrayList<Card>();
        ArrayList<Card> col2;
        col2 = new ArrayList<Card>();
        ArrayList<Card> col3;
        col3 = new ArrayList<Card>();
        ArrayList<Card> col4;
        col4 = new ArrayList<Card>();

        //Deal
        if(button == 0){

            col1.add(deck.drawFromDeck());
            col2.add(deck.drawFromDeck());
            col3.add(deck.drawFromDeck());
            col4.add(deck.drawFromDeck());
            result.render("card1", col1.get( (col1.size())-1 ));
            result.render("card2", col2.get( (col2.size())-1 ));
            result.render("card3", col3.get( (col3.size())-1 ));
            result.render("card4", col4.get( (col4.size())-1 ));

        }
        //Col 1 Move
        else if(button == 1){

        }
        //Col 1 remove
        else if(button == 2){

        }
        //Col 2 Move
        else if(button == 3){

        }
        //Col 2 remove
        else if(button == 4){

        }
        //Col 3 Move
        else if(button == 5){

        }
        //Col 3 remove
        else if(button == 6){

        }
        //Col 4 Move
        else if(button == 7){

        }
        //Col 4 remove
        else if(button == 8){

        }

            return result;
     //   return Results.html().template("views/testview/testview.ftl.html");
    }





}

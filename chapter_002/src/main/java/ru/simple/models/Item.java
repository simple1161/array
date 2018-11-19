package ru.simple.models;

public class Item{
        private String id;

        public String name;

        public String description;

        public long create;

        Item(){}

        public Item(String name, String description, long create){
                this.name = name;
                this.description = description;
                this.create = create;
        }

        public String getName(){
                return this.name;
        }

        public String getDescription(){
                return this.description;
        }

        public long getCreate(){
                return this.create;
        }

        public void setId(String id){
                this.id = id;
        }

        public String getId(){
                return this.id;
        }



}
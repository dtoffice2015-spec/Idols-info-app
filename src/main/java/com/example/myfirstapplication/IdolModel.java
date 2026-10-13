package com.example.myfirstapplication;

    public class IdolModel {
        private String name;
        private String shortRole;
        private String fullInfo;
        private int imageResId;

        public IdolModel(String name, String shortRole, String fullInfo, int imageResId) {
            this.name = name;
            this.shortRole = shortRole;
            this.fullInfo = fullInfo;
            this.imageResId = imageResId;
        }

        public String getName() { return name; }
        public String getShortRole() { return shortRole; }
        public String getFullInfo() { return fullInfo; }
        public int getImageResId() { return imageResId; }
    }


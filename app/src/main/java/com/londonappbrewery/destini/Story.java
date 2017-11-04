package com.londonappbrewery.destini;

/**
 * Created by tijs on 4/11/17.
 */

public class Story {

    private int mStoryId;
    private int mStoryAnswer1, mStoryAnswer2;


    public Story(int id, int answer1, int answer2) {
        setStoryId(id);
        setStoryAnswer1(answer1);
        setStoryAnswer2(answer2);

    }

    public int getStoryId() {
        return mStoryId;
    }

    public void setStoryId(int storyId) {
        mStoryId = storyId;
    }

    public int getStoryAnswer1() {
        return mStoryAnswer1;
    }

    public void setStoryAnswer1(int storyAnswer1) {
        mStoryAnswer1 = storyAnswer1;
    }

    public int getStoryAnswer2() {
        return mStoryAnswer2;
    }

    public void setStoryAnswer2(int storyAnswer2) {
        mStoryAnswer2 = storyAnswer2;
    }


}

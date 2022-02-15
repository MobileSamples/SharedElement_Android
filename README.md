![Excellent Webworld Company Logo](https://eww-wp-new.s3.ap-south-1.amazonaws.com/wp-content/uploads/2021/10/21124036/Excellent-Webworld-logo-svg.jpg)

# Overview - Shared Element Transition 



Transitions that occur between different activities and  fragments which involve entry and exit of transitions. The entire view hierarchies are interdependent on each other. 

Examples of such transitions are slide transition, fade transition, and explode transition.

* Explode - Moves views in or out from the center of the scene.
* Slide - Moves views in or out from one of the edges of the scene.
* Fade - Adds or removes a view from the scene by changing its opacity.



![Alt Text](https://eww-wp-new.s3.ap-south-1.amazonaws.com/wp-content/uploads/2022/01/11124324/gif-04.gif)



## Requirement
Android 5.0 (API Level 21) & Above 

## Implementation of Shared Element Transition in Android
Let’s study step by step how these can be seamlessly implemented in your application. 

### In Your Activity’s xml File
Start your work by going to the activity_main.xlm file. Now create a layout with an Image view. Below is the coding for the file here its activity_main.xml

In your activity_main.xml File Create a Layout With imageview like below

        <ImageView
            android:id="@+id/img_tajmahal"
            android:layout_width="150dp"
            android:layout_height="100dp"
            android:layout_marginStart="20dp"
            android:layout_marginTop="40dp"
            android:scaleType="fitXY"
            android:elevation="4dp"
            android:src="@drawable/taj_mahal"
            app:layout_constraintBottom_toBottomOf="parent"
            android:transitionName="@string/transition_name"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent" />


### A Common Transition Name for Both Screens

In ImageView declare  transition name (use any string) Like we mentioned above "android:transitionName="@string/transition_name"

_We have to use this same transition name in another activity/fragment's Imageview respectively ._

### Open Activity 

In order to go from activity 1 to activity 2, one requires coding for the transition to occur. Below are the codes that perform the same activity.

So in our case in the activity_result.xml Layout Here below is the sample of ImageView.

            <ImageView
                android:id="@+id/img_result"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:scaleType="fitXY"
                android:transitionName="@string/transition_name" />



_Note:- As you can see we have declared the same transition name in ImageView  (Transition Name must be same as previous ImageView)_

### Start an Activity with Shared Element

To make screen transition animation between two activities,  get back to MainActivity.kt and set intent for going to ResultActivity
  
  
    val intent = Intent(this, ResultActivity::class.java)
    val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
    this, binding.imgGatewayofindia, getString(R.string.transition_name))
    startActivity(intent, options.toBundle())


_Note: add transitionanimation using "ActivityOptionsCompat" and startActivity with "options"_

**Credits:- The code was developed by our extremely talented developer Vimars.**


## Support
If you have any questions, issues, or propositions, please create a new issue in this repository.
If you any questions regarding <a href="https://www.excellentwebworld.com/android-app-development-services/?utm_source=github&utm_campaign=android-app-development">Android application development services</a> or want to <a href="https://www.excellentwebworld.com/hire-android-app-developers/?utm_source=github&utm_campaign=hire+android-developers">hire Android app developer</a>, then send an email to biz@excellentwebworld.com or fill out the form on the contact page

<a href="https://github.com/MobileSamples/SharedElement_iOS">Check shared element for iOS</a>.

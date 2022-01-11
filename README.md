![Excellent Webworld Company Logo](https://eww-wp-new.s3.ap-south-1.amazonaws.com/wp-content/uploads/2021/10/21124036/Excellent-Webworld-logo-svg.jpg)

# Overview

Shared Element Transition 

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

### Create a File and Start Working
Start your work by going to the activity_main.xlm file. Now create a layout with an Image view. Below is the coding for the file (acitivity_main.xml)

In your activity_main.xml File Create a Layout With ImageView
(
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
)

### A Common Transition Name for Both Screens

In ImageView declare  transitionname (use any string) Like we mentioned above "android:transitionName="@string/transition_name"

We have to use this same transition name in another activity/fragment's Imageview.

### Open Activity 

In order to go from activity 1 to activity 2, one requires the code for that transition to happen. Below are the codes for performing the same activity.


So in activity_result.xml Layout Here below is the sample of ImageView.
(
            <ImageView
                android:id="@+id/img_result"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:scaleType="fitXY"
                android:transitionName="@string/transition_name" />
)


Note:- As you can see we have declared the same transition name in ImageView  (Transition Name must be same as previous ImageView)

### Start an Activity with Shared Element

To make screen transition animation between two activities,  get back to MainActivity.kt and set intent for going to ResultActivity

(  
val intent = Intent(this, ResultActivity::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this, binding.imgGatewayofindia, getString(R.string.transition_name)
            )
            startActivity(intent, options.toBundle())
)

**Note: **add transition animation using "ActivityOptionsCompat" and startActivity with "options"

## Support
If you have any questions, issues or propositions, please create a [New Issue](https://github.com/Cleveroad/AdaptiveTableLayout/issues/new) in this repository.

If you want to hire us, send an email to sales@cleveroad.com or fill the form on [Contact us](https://www.cleveroad.com/contact/)

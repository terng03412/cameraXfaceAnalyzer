package com.hpcnc.cameraxfaceanalyzer

import android.graphics.Rect

data class Prediction( var bbox : Rect, var label : String )
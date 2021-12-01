package com.example.ca_1;

import com.example.ca_1.NEW_TV_SHOW_ID;
import java.util.*;

data class TvShowEntity (
    var id: Int,
    var name: String,
    var showDescription: String
)
{
    constructor() : this(NEW_TV_SHOW_ID, "",  "")
    constructor(name: String, showDescription: String) : this(NEW_TV_SHOW_ID, name, showDescription)
}
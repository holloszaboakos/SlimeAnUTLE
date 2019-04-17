package data.type

class SName(content: String="", names: List<SName> = listOf()):SText(content, names){
    constructor(t:SText,names: List<SName> = listOf()):this(t(),names)
}
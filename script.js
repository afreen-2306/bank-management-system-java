function calculateResult()
{
    let name = document.getElementById("name").value;
    let m1 = Number(document.getElementById("m1").value);
    let m2 = Number(document.getElementById("m2").value); 
    let m3 = Number(document.getElementById("m3").value);
    if(name === "" || isNaN(m1) || isNaN(m2) || isNaN(m3))
    {
        alert("Please fill all fields correctly");
        return;
    }
    if(m1<0 || m1>100 || m2<0 || m2>100 || m3<0 || m3>100)
    {
        alert("Marks must be between 0 and 100");
        return;
    }
    let total = m1+m2+m3;
    let average=total/3;
    let grade;
    let result;
    if(average>=75)
        grade="A";
    else if(average >=60)
        grade="B";
    else if(average >= 40)
        grade = "C";
    else
        grade="F";
    result = (grade === "F") ? "Fail" : "Pass";
    document.getElementById("output").innerHTML =
`<b>Name:</b> ${name} <br>
<b>Total:</b> ${total} <br>
<b>Average:</b> ${average} <br>
<b>Grade:</b> ${grade} <br>
<b>Result:</b> ${result}`;


}           
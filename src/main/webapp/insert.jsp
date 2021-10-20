<!DOCTYPE html>
<html>
    <head>
        <title>Register Page</title>
    </head>

    <body>
        <form action="./reg" method="GET">
            <table>
                <tr>
                    <td>ID : </td>
                    <td><input type="text" name="eid" /></td>
                </tr>

                <tr>
                    <td>Name : </td>
                    <td><input type="text" name="ename" /></td>
                </tr>
                
                
                <tr>
                    <td>Tech. : </td>
                    <td><input type="text" name="etech" /></td>
                </tr>

                <tr>
                    <td></td>
                    <td><input type="submit" name="submit" value="Register" /></td>
                </tr>
            </table>
            
            <a href="search.jsp">Search Here</a> &nbsp; &nbsp;
            <a href="update.jsp">Update Here</a> &nbsp; &nbsp;
            <a href="delete.jsp">delete Here</a> &nbsp; &nbsp;
            <a href="search-with-tech.jsp">Search By Tech. Here</a> &nbsp; &nbsp;
            <a href="gt-by-id.jsp">Greater Than By ID Here</a> &nbsp; &nbsp;
            <a href="sort.jsp">Sorting By name with provided tech Here</a> &nbsp; &nbsp;
        </form>
    </body>
</html>

package org.projet.library.model.users;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UsersWS", targetNamespace = "http://webapp.libraryservice.projet.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UsersWS {


    /**
     * 
     * @param arg0
     * @return
     *     returns org.projet.library.model.users.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "idUser", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.users.IdUser")
    @ResponseWrapper(localName = "idUserResponse", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.users.IdUserResponse")
    @Action(input = "http://webapp.libraryservice.projet.org/UsersWS/idUserRequest", output = "http://webapp.libraryservice.projet.org/UsersWS/idUserResponse")
    public User idUser(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns java.util.List<org.projet.library.model.users.User>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "doList", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.users.DoList")
    @ResponseWrapper(localName = "doListResponse", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.users.DoListResponse")
    @Action(input = "http://webapp.libraryservice.projet.org/UsersWS/doListRequest", output = "http://webapp.libraryservice.projet.org/UsersWS/doListResponse")
    public List<User> doList();

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns org.projet.library.model.users.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "doLogin", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.users.DoLogin")
    @ResponseWrapper(localName = "doLoginResponse", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.users.DoLoginResponse")
    @Action(input = "http://webapp.libraryservice.projet.org/UsersWS/doLoginRequest", output = "http://webapp.libraryservice.projet.org/UsersWS/doLoginResponse")
    public User doLogin(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateUser", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.users.UpdateUser")
    @ResponseWrapper(localName = "updateUserResponse", targetNamespace = "http://webapp.libraryservice.projet.org/", className = "org.projet.library.model.users.UpdateUserResponse")
    @Action(input = "http://webapp.libraryservice.projet.org/UsersWS/updateUserRequest", output = "http://webapp.libraryservice.projet.org/UsersWS/updateUserResponse")
    public void updateUser(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0);

}


package attainittech.prototypeo365login.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController
{
    @GetMapping(value = "/")
    @PreAuthorize("hasAuthority('APPROLE_ADMINISTRATOR')")
    public String index(Model model, OAuth2AuthenticationToken token)
    {
        if (token != null)
        {
            final OAuth2User user = token.getPrincipal();
            model.addAttribute("grant_type", user.getAuthorities());
            model.addAllAttributes(user.getAttributes());
        }
        model.addAttribute("currentdt", "" + new java.util.Date().toString());
        return "root";
    }
}
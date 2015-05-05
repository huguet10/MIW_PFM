package es.upm.miw.pwitter.rest.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CompetitionController {

	/*
	 * private final static Log LOG = LogFactory
	 * .getLog(CompetitionController.class);
	 * 
	 * @Inject private IHandlerCompetitions handlerCompetitions;
	 * 
	 * @RequestMapping(method = RequestMethod.POST) public @ResponseBody Message
	 * doPost(@RequestBody Competition competition) {
	 * handlerCompetitions.addCompetition(competition); Message result = new
	 * Message("Insertado correctamente", Boolean.TRUE); return result; }
	 * 
	 * @RequestMapping(method = RequestMethod.GET) public @ResponseBody
	 * List<Competition> getAllCompetitions() { return
	 * handlerCompetitions.getCompetitions(); }
	 * 
	 * @RequestMapping(method = RequestMethod.GET) public @ResponseBody
	 * Competition getCompetitionByNameCountryAndSport(
	 * 
	 * @RequestParam Map<String, String> params) { Sport sport =
	 * Sport.valueOf(params.get("sport")); Country country =
	 * Country.valueOf(params.get("country")); String name = params.get("name");
	 * Competition competition = new Competition(null, name, country, sport);
	 * return handlerCompetitions.findCompetition(competition); }
	 * 
	 * @RequestMapping(method = RequestMethod.PUT) public @ResponseBody Message
	 * updateCompetition(
	 * 
	 * @RequestBody Competition competition) {
	 * handlerCompetitions.updateCompetition(competition); Message result = new
	 * Message("Borrado correctamente", Boolean.TRUE); return result; }
	 * 
	 * @RequestMapping(method = RequestMethod.DELETE) public @ResponseBody
	 * Message deleteCompetition(
	 * 
	 * @RequestBody Competition competition) {
	 * handlerCompetitions.removeCompetition(competition); Message result = new
	 * Message("Borrado correctamente", Boolean.TRUE); return result; }
	 */

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public String showIndex() {
		return "Hello world";
	}
}

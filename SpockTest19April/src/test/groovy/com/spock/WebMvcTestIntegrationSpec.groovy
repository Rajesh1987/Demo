package com.spock

import static org.hamcrest.Matchers.*
import static org.springframework.http.MediaType.APPLICATION_JSON
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.web.servlet.setup.MockMvcBuilders

import spock.lang.Specification

@ContextConfiguration
@WebMvcTest(controllers = SpockController.class)
class WebMvcTestIntegrationSpec extends Specification {

	def service = Mock(SpockService)
	
	def spockController = new SpockController(service: service)
	
		
	def mockMvc = MockMvcBuilders.standaloneSetup(spockController).build()
	
	def "retrieve message"() {
		
		when:
		def response = mockMvc.perform(get('/msg')
				.contentType(APPLICATION_JSON)
				)

		then:
		1 * spockController.service.retrieveMessage() >> 'Hello'

		response.andExpect(status().isOk())
				.andExpect(content().string("Hello"))
				
	}
	}
	

<h1>Cards</h1>
 <h4>Android Material Design CardView general template designed by <a href="https://github.com/rajatpunkstaa" name="Rajat Gupta">Rajat Gupta</a>  </h4>
 <h1>
 <img src="https://storage.googleapis.com/material-design/publish/material_v_10/assets/0Bzhp5Z4wHba3TVlLZ3RQUDBSX3c/components_cards_action6.png" align="center" width="760" height="630" /> <br><br>
 </h1>

 <h3>
 <p>A card is a sheet of material that serves as an entry point to more detailed information.
 Cards may contain a photo, text, and a link about a single subject. They may display content containing elements of varying size, such as photos with captions of variable length.</p>
 </h3>

 <h1>
 <img src="https://storage.googleapis.com/material-design/publish/material_v_10/assets/0Bzhp5Z4wHba3cXVadmtJa19wT3M/components_cards_content1.png" width="360" height="640" />
 <img src="https://storage.googleapis.com/material-design/publish/material_v_10/assets/0Bzhp5Z4wHba3NGo3QkpVWTNBZzA/components_cards_content3.png" align="right" width="360" height="640" />
 </h1>

 <h2>Usage</h2>
 <p>Cards are a convenient means of displaying content composed of different elements. They’re also well-suited for showcasing elements whose size or supported actions vary, like photos with captions of variable length.</p>

 <h2>Content</h2>
 <p>Cards provide context and an entry point to more robust information and views, and their content and quantity can vary greatly. Cards within a card collection can each contain a unique data set, such as a checklist with an action, a note with an action, and a note with a photo.</p>
 <h1>
 <img src="https://storage.googleapis.com/material-design/publish/material_v_10/assets/0B6Okdz75tqQsZWNWWDZVek41S1U/components_cards_content2.png" width="360" height="640" />
 <img src="https://storage.googleapis.com/material-design/publish/material_v_10/assets/0Bzhp5Z4wHba3b1N2Q2swOFNuX28/components_cards_content4.png" align="right" width="360" height="640" />
 </h1>
 <p>Don't overload cards with extraneous information or actions.<br>

 Content hierarchy<br>
 Use hierarchy within the card to direct users’ attention to the most important information. For example, place primary content at the top of the card, or use typography to emphasize primary content.<br>

 Images can reinforce other content in a card. However, their size and placement within the card depends on whether images are the primary content or are being used to supplement other content on the card.<br>


 Text is most legible when placed on a solid color background with a sufficient contrast ratio to the text. Text placed on image backgrounds should preserve text legibility.</p>



 <h2><br><br>Behavior</h2>

 <p>Cards have a constant width and variable height. The maximum height is limited to the height of the available space on a platform, but it can temporarily expand (for example, to display a comment field).<br>

 Cards do not flip over to reveal information on the back.</p>


 <h3>Supported gestures</h3>
 <strong>Card gestures should be consistently implemented within a card collection.</strong>

 <h4>Supported gestures include: </h4>

 <p>The swipe gesture may be used on a per-card basis. Limit swipe gestures within a view so that they don’t overlap with one another. For example, a swipeable card should not contain a swipeable image carousel, so that only a single action occurs when the card is swiped.
 The pick-up-and-move gesture may be used if it is important for the user to be able to sort cards within a collection. But consider if filtering or sorting would better organize the content.</p>



 <h1>
 <h4><br><br>Card collection filtering and sorting</h4>


 <p>Card collections can be programmatically sorted or filtered by date, file size, alphabetical order, or other parameters.</p> <br>

 The first item in the collection is positioned at the top left.<br>
 The order proceeds left to right and top to bottom.
 </h1>


 <h1>
 <h4>Scrolling</h4>
 <p>Card collections only scroll vertically.

 Card content that exceeds the maximum card height is truncated and does not scroll, but the card can be expanded. Once expanded, the card may exceed the maximum height of the view. In this case, the card will scroll with the card collection.</p>
 </h1>
 <h1>
 <img src="https://storage.googleapis.com/material-design/publish/material_v_10/assets/0Bzhp5Z4wHba3dnROYlN6b1hsTmM/components_cards_behavior2.png" align="left" width="350" height="600"/>
 </h1>

 <h4><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br> Find out more at the Android Developer Documentation. Keep me posted for any suggestions </h4>
